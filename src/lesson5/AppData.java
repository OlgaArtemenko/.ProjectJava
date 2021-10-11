package lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data;
    public static final String DEL = ";";


    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void setData(Integer[][] data) {
        this.data = data;
    }

    public void readCSVFile(String file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ArrayList<Integer[]> rows = new ArrayList<>();
            header = ( reader.readLine().split(DEL) );
            String line;
            while (( line = reader.readLine() ) != null) {
                String[] strArr = line.split(DEL);
                Integer[] intArr = new Integer[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    intArr[i] = Integer.parseInt(strArr[i]);
                }
                rows.add(intArr);
            }
            data = rows.toArray(new Integer[][]{});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeCSVFile(String fileName) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8));
            StringBuffer oneLine = new StringBuffer();
            for (int i = 0; i < header.length; i++) {
                oneLine.append(header[i]);
                oneLine.append(DEL);
            }
            bw.write(oneLine.toString());
            bw.newLine();

            for (int i = 0; i < data.length; i++) {
                Integer[] rowData = data[i];
                oneLine.delete(0, oneLine.length());
                for (int j = 0; j < rowData.length; j++) {
                    oneLine.append(rowData[j]);
                    oneLine.append(DEL);
                }
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

