package com.wc.vs.main;

import com.wc.vs.tool.Tool;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File dir = new File("apps");

        if ( !dir.isDirectory() || !dir.exists() ) {

            dir.mkdir();

        }

        String appPath;

        String entrance;

        String code;

        System.out.println("����������");

        System.out.print("��������Ŀ����");

        Scanner scanner = new Scanner(System.in);

        String appName = scanner.next();

        appPath = "apps/" + appName;

        entrance = appPath + "/Enter.van";

        File entranceFile = new File(entrance);

        BufferedReader read = new BufferedReader(new FileReader(entranceFile));

        while (true) {
            code = read.readLine();
            if (code.equals("stop")){
                break;
            }
            Tool.codeProcessor(code);
        }
    }
}
