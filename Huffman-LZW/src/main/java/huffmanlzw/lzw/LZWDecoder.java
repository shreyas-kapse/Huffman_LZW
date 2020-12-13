/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmanlzw.lzw;

import huffmanlzw.datastructures.CustomArrayList;
import huffmanlzw.datastructures.CustomHashMap;

/**
 *
 * @author mmatila
 */
public class LZWDecoder {

    private CustomArrayList<Integer> compressed;
    private CustomHashMap<Integer, String> dictionary;
    private int dictionarySize;
    private String decompressed;

    public LZWDecoder(CustomArrayList<Integer> compressed) {
        this.compressed = compressed;
        this.dictionary = buildDecodingDictionary();
    }

    public void execute() {
        decompress();
    }

    /**
     * Initializing the dictionary with the first 255 ASCII entries
     *
     * @return Dictionary with the first 255 ASCII entries
     */
    public CustomHashMap<Integer, String> buildDecodingDictionary() {
        dictionary = new CustomHashMap<>();
        dictionarySize = 256;

        for (int i = 0; i < 256; i++) {
            dictionary.put(i, "" + (char) i);
        }

        return dictionary;
    }

    /**
     * The actual decompressing method that turns the compressed list of ASCII
     * codes back into a string
     */
    public void decompress() {
        String first = "" + (char) (int) compressed.remove(0);
        StringBuffer result = new StringBuffer(first);
        for (int i = 1; i < compressed.size(); i++) {
            String entry;
            if (dictionary.containsKey(compressed.get(i))) {
                entry = dictionary.get(compressed.get(i));
            } else if (compressed.get(i) == dictionarySize) {
                entry = first + first.charAt(0);
            } else {
                // For a case where compressing might have gone wrong
                throw new IllegalArgumentException("Something went wrong decompressing the ASCII code: " + compressed.get(i));
            }

            result.append(entry);
            dictionary.put(dictionarySize++, first + entry.charAt(0));

            first = entry;
        }

        decompressed = result.toString();
    }
}