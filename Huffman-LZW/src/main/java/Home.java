import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

import huffmanlzw.huffman.HuffmanDecoder;
import huffmanlzw.huffman.HuffmanEncoder;
import huffmanlzw.lzw.LZWDecoder;
import huffmanlzw.lzw.LZWEncoder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;

public class Home extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Huffman Encoding Project ");
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JLabel encoding_status;
	JLabel total_time_txt;
	JLabel og_file_size_txt;
	JLabel compress_file_size_txt;
	JLabel compressed_file_txt;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_5;
	JLabel lblNewLabel_6;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_8;
	JLabel lblNewLabel_8_1;
	JLabel lblNewLabel_7_1;
	JLabel lblNewLabel_5_1;
	JLabel lblNewLabel_4_1;
	JLabel lblNewLabel_6_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public Home() {
		setTitle("Huffman Encoding Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1166, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(434, 10, 284, 30);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBounds(763, 59, 323, 259);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
	
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Compress a file using Huffman encoding\r\n    ");
		buttonGroup.add(rdbtnNewRadioButton);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton, 44, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton, -10, SpringLayout.EAST, panel);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(" Decompress a file using Huffman decoding");
		buttonGroup.add(rdbtnNewRadioButton_1);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		sl_panel.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton_1, -138, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_1, -10, SpringLayout.EAST, panel);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Compress a file using Lempel-Ziv-Welch encoding\r\n");
		buttonGroup.add(rdbtnNewRadioButton_2);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1, 6, SpringLayout.SOUTH, rdbtnNewRadioButton_2);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_2, 6, SpringLayout.SOUTH, rdbtnNewRadioButton);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_2, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		sl_panel.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton_2, -178, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_2, 1, SpringLayout.EAST, rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Decompress a file using Lempel-Ziv-Welch decoding");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1_1, 6, SpringLayout.SOUTH, rdbtnNewRadioButton_1);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1_1, 0, SpringLayout.WEST, rdbtnNewRadioButton);
		sl_panel.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton_1_1, -98, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_1_1, 0, SpringLayout.EAST, rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Performance tests");
		buttonGroup.add(rdbtnNewRadioButton_1_2);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1_2, 6, SpringLayout.SOUTH, rdbtnNewRadioButton_1_1);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton_1_2, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton_1_2, -58, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_1_2, 0, SpringLayout.EAST, rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton_1_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					   huffmanEncode();
					   
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
					try {
						lzwEncode();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
					 try {
						huffmanDecode();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				if(rdbtnNewRadioButton_1_1.isSelected()) {
					lzwDecode();
				}
				if(rdbtnNewRadioButton_1_2.isSelected()) {
					 testPerformance();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(773, 324, 110, 38);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				clearText();
			}
		});
		textField.setToolTipText("File Name");
		textField.setBounds(159, 59, 535, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("File Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(21, 59, 98, 30);
		contentPane.add(lblNewLabel_1);
		
		 og_file_size_txt = new JLabel("Original size of the file ");
		og_file_size_txt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		og_file_size_txt.setBounds(159, 199, 535, 33);
		contentPane.add(og_file_size_txt);
		
		total_time_txt = new JLabel("Total Time");
		total_time_txt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		total_time_txt.setBounds(159, 156, 535, 33);
		contentPane.add(total_time_txt);
		
		 compress_file_size_txt = new JLabel("Compressed size of the file");
		compress_file_size_txt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		compress_file_size_txt.setBounds(159, 242, 535, 33);
		contentPane.add(compress_file_size_txt);
		
		compressed_file_txt = new JLabel("Compressed file is ");
		compressed_file_txt.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		compressed_file_txt.setBounds(159, 285, 535, 33);
		contentPane.add(compressed_file_txt);
		
		encoding_status = new JLabel("Encoding Status ");
		
		encoding_status.setFont(new Font("Times New Roman", Font.BOLD, 15));
		encoding_status.setBounds(159, 112, 535, 33);
		contentPane.add(encoding_status);
		
		JLabel lblNewLabel_2 = new JLabel("Encoding Stats");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(21, 130, 98, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Huffman Performance");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(21, 460, 152, 38);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(183, 474, 334, 13);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(183, 497, 334, 13);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(183, 530, 334, 13);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(183, 561, 334, 13);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(183, 584, 334, 13);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setBounds(737, 584, 334, 13);
		contentPane.add(lblNewLabel_8_1);
		
		lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setBounds(737, 561, 334, 13);
		contentPane.add(lblNewLabel_7_1);
		
		lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(737, 530, 334, 13);
		contentPane.add(lblNewLabel_6_1);
		
		lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setBounds(737, 497, 334, 13);
		contentPane.add(lblNewLabel_5_1);
		
		lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setBounds(737, 474, 334, 13);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("LZW Performance");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(575, 460, 152, 38);
		contentPane.add(lblNewLabel_3_1);
		
	  
	}
	public void clearText() {
		encoding_status.setText("");
		total_time_txt.setText("");
		og_file_size_txt.setText("");
		compress_file_size_txt.setText("");
		compressed_file_txt.setText("");
		lblNewLabel_5.setText("");;
		lblNewLabel_4.setText("");
		lblNewLabel_6.setText("");
		lblNewLabel_7.setText("");;
		lblNewLabel_8.setText("");;
		lblNewLabel_8_1.setText("");;
		lblNewLabel_7_1.setText("");
		lblNewLabel_5_1.setText("");
		lblNewLabel_4_1.setText("");
		lblNewLabel_6_1.setText("");
	}
	 public void huffmanEncode() {
	        System.out.print("\nName of the file to compress: ");
	        String fileName = textField.getText();
	        String compressedFileName = generateCompressedFileName(fileName, ".huff");
	        File toCompress = new File(fileName);
	        try {
	            Long start = System.currentTimeMillis();
	            File compressed = new File(compressedFileName);
	            HuffmanEncoder encoder = new HuffmanEncoder(toCompress);
	            encoder.execute();
	            Long end = System.currentTimeMillis();
	            printEncodingStats(start, end, toCompress, compressed,encoding_status,total_time_txt,og_file_size_txt,compress_file_size_txt,compressed_file_txt);
	            askToContinue();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	            printOptions(false);
	        }
	    }
	    
	    public void lzwEncode() throws IOException {
	        System.out.print("\nName of the file to compress: ");
	        String fileName = textField.getText();
	        String compressedFileName = generateCompressedFileName(fileName, ".lzw");
	        File toCompress = new File(fileName);
	        try {
	            Long start = System.currentTimeMillis();
	            File compressed = new File(compressedFileName);
	            compressed.createNewFile();
	            LZWEncoder encoder = new LZWEncoder(toCompress);
	            encoder.execute();
	            Long end = System.currentTimeMillis();
	            printEncodingStats(start, end, toCompress, compressed,encoding_status,total_time_txt,og_file_size_txt,compress_file_size_txt,compressed_file_txt);
	            askToContinue();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	            printOptions(false);
	        }
	    }
	    
	    public void lzwDecode() {
	        System.out.print("\nName of the file to decompress: ");
	        String fileName = textField.getText();
	        File toDecompress = new File(fileName);
	        try {
	            Long start = System.currentTimeMillis();
	            LZWDecoder decoder = new LZWDecoder(toDecompress);
	            decoder.execute();
	            Long end = System.currentTimeMillis();
	            printDecodingStats(start, end,encoding_status,total_time_txt);
	            askToContinue();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	            printOptions(false);
	        }
	    }
	    
	    public void huffmanDecode() throws IOException {
	        System.out.print("\nName of the file to decompress: ");
	        String fileName =textField.getText();
	        File toDecompress = new File(fileName);
	        try {
	            Long start = System.currentTimeMillis();
	            HuffmanDecoder decoder = new HuffmanDecoder(toDecompress);
	            decoder.decompress();
	            Long end = System.currentTimeMillis();
	            printDecodingStats(start, end,encoding_status,total_time_txt);
	            askToContinue();
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	            printOptions(false);
	        }
	    }
	    
	    public void testPerformance() {
	        System.out.print("\nName of the file to use for performance testing: ");
	        String fileName =textField.getText();
	        File toTest = new File(fileName);
	        if (toTest.exists()) {            
	            try {
	                System.out.println("\n --- HUFFMAN ---\n");
	                huffmanPerformance(toTest,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8);
	                System.out.println("\n--- Lempel-Ziv-Welch ---\n");
	                lzwPerformance(toTest,lblNewLabel_4_1,lblNewLabel_5_1,lblNewLabel_6_1,lblNewLabel_7_1,lblNewLabel_8_1);
	                askToContinue();
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	                printOptions(false);
	            }
	        } else {
	            System.out.println("Could not find file: " + fileName + "\n");
	            printOptions(false);
	        }
	    }
	    
	    public void handleDefault() {
	        printOptions(true);
	    }

	    public void handleExit() {
	        System.out.print("\nExit successful");
	        System.exit(0);
	    }
	    
	    public void askToContinue() {
	        System.out.print("Continue? [Y]es or [N]o: ");
	        String choice = textField.getText();
	        switch(choice) {
	            case "Y":
	                printOptions(false);
	                break;
	            case "y":
	                printOptions(false);
	                break;
	            case "N":
	                handleExit();
	            case "n":
	                handleExit();
	        }
	    }
	public void huffmanPerformance(File file,JLabel lblNewLabel_4,JLabel lblNewLabel_5,JLabel lblNewLabel_6,JLabel lblNewLabel_7,JLabel lblNewLabel_8) {
        String compressedFileName = generateCompressedFileName(file.getName(), ".huff");
        try {
            Long start = System.currentTimeMillis();
            File compressed = new File(compressedFileName);
            HuffmanEncoder encoder = new HuffmanEncoder(file);
            encoder.execute();
            Long end = System.currentTimeMillis();
//            System.out.println("Original file size: " + file.length() + " bytes");
            lblNewLabel_4.setText("Original file size: " + file.length() + " bytes");
//            System.out.println("Encoding took: " + (end - start) + " ms");
            lblNewLabel_5.setText("Encoding took: " + (end - start) + " ms");
//            System.out.println("Compressed file size: " + compressed.length() + " bytes");
            lblNewLabel_6.setText("Compressed file size: " + compressed.length() + " bytes");
//            System.out.println(("Compressed file is " + Math.round(compressed.length() * 10.0 / file.length() * 10.0) + "% of the original size"));
            lblNewLabel_7.setText((("Compressed file is " + Math.round(compressed.length() * 10.0 / file.length() * 10.0) + "% of the original size")));
            start = System.currentTimeMillis();
            HuffmanDecoder decoder = new HuffmanDecoder(new File (compressedFileName));
            decoder.decompress();
            end = System.currentTimeMillis();
            System.out.println("Decoding took: " + (end - start) + " ms");
            lblNewLabel_8.setText("Decoding took: " + (end - start) + " ms");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void lzwPerformance(File file,JLabel lblNewLabel_4_1,JLabel lblNewLabel_5_1,JLabel lblNewLabel_6_1,JLabel lblNewLabel_7_1,JLabel lblNewLabel_8_1) {
        String compressedFileName = generateCompressedFileName(file.getName(), ".lzw");
        try {
            Long start = System.currentTimeMillis();
            File compressed = new File(compressedFileName);
            compressed.createNewFile();
            LZWEncoder encoder = new LZWEncoder(file);
            encoder.execute();
            Long end = System.currentTimeMillis();
//            System.out.println("Original file size: " + file.length() + " bytes");
            lblNewLabel_4_1.setText("Original file size: " + file.length() + " bytes");
//            System.out.println("Encoding took: " + (end - start) + " ms");
            lblNewLabel_5_1.setText("Encoding took: " + (end - start) + " ms");
//            System.out.println("Compressed file size: " + compressed.length() + " bytes");
            lblNewLabel_6_1.setText("Compressed file size: " + compressed.length() + " bytes");
//            System.out.println(("Compressed file is " + Math.round(compressed.length() * 10.0 / file.length() * 10.0) + "% of the original size"));
            lblNewLabel_7_1.setText(("Compressed file is " + Math.round(compressed.length() * 10.0 / file.length() * 10.0) + "% of the original size"));
            start = System.currentTimeMillis();
            LZWDecoder decoder = new LZWDecoder(compressed);
            decoder.execute();
            end = System.currentTimeMillis();
//            System.out.println("Decoding took: " + (end - start) + " ms\n");
            lblNewLabel_8_1.setText("Decoding took: " + (end - start) + " ms\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    public void printOptions(boolean isDefault) {
        System.out.println("\nWhat would you like to do? 'exit' exits the program");
        System.out.println("\t1. Compress a file using Huffman encoding");
        System.out.println("\t2. Compress a file using Lempel-Ziv-Welch encoding");
        System.out.println("\t3. Decompress a file using Huffman decoding");
        System.out.println("\t4. Decompress a file using Lempel-Ziv-Welch decoding");
        System.out.println("\t5. Performance tests\n");
        if (isDefault) {
            System.out.println("Invalid command\n");
        }
        System.out.print("Enter [1-5]: ");
    }

    public void printEncodingStats(Long start, Long end, File before, File after,JLabel encoding_status,JLabel total_time,JLabel og_file_size,JLabel compressed_size,JLabel compressed_file) {  
//        System.out.println("\n----- Encoding successful! -----\n");
        String txt=encoding_status.getText();
        encoding_status.setText(" Encoding successful! ");
//        System.out.println("Total time: " + (end - start) + "ms");
        total_time.setText("Total time: " + (end - start) + "ms");
//        System.out.println("Original size of the file: " + before.length() + " bytes");
        og_file_size.setText("Original size of the file: " + before.length() + " bytes");
//        System.out.println("Compressed size of the file: " + after.length() + " bytes");
        compressed_size.setText("Compressed size of the file: " + after.length() + " bytes");
//        System.out.println("Compressed file is " + Math.round(after.length() * 10.0 / before.length() * 10.0) + "% of the original size\n");
        compressed_file.setText("Compressed file is " + Math.round(after.length() * 10.0 / before.length() * 10.0) + "% of the original size");
    }
    
    public void printDecodingStats(Long start, Long end,JLabel status,JLabel total_time) {
//        System.out.println("\n----- Decoding successful! -----\n");
        status.setText(" Decoding successful! ");
//        System.out.println("Total time: " + (end - start) + "ms\n");
        total_time.setText("Total time: " + (end - start) + "ms");
    }
    
    public String generateCompressedFileName(String fileName, String type) {
        String compressedFileName = fileName.replaceFirst("[.][^.]+$", "") + type;
        
        return compressedFileName;
    }
}
