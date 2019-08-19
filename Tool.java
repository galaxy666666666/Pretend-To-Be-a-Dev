package com.wc.vs.tool;

import com.wc.vs.Entity.Obj;

public class Tool {

    public static void codeProcessor(String oldCode) {

        StringBuffer code1 = new StringBuffer("");

        for (int c = 0;c < oldCode.length();c++) {
            if (oldCode.charAt(c) = "" || oldCode.charAt(c) = '\t'){

            }
        }

        String code = code1.toString();

        for (int i = 0; i < code.length(); i++) {
            String s = String.valueOf(code.charAt(i));

            // 如果最后一个字符是类声明符
            if (i == code.length()-1 && s.equals(":")){
                StringBuffer className = new StringBuffer("");
                for (int a = 0; a<code.length()-1; a++){
                    className.append(code.charAt(a));
                }
                Obj obj = new Obj(className.toString());
            }

            // 如果第一个字符是注释
            if (i == 0 && s.equals("~")){
                return;
            }

            // 如果第一个字符是输出符号
            if (i == 0 && s.equals("♂")) {

                int start = code.indexOf("(");
                int end = code.indexOf(")");

                StringBuffer temp = new StringBuffer("");

                for (int a = start; a <= end; a++) {
                    temp.append(code.charAt(a));
                }

                int index = temp.indexOf("\"");
                int index2 = temp.lastIndexOf("\"");

                System.out.println(index);
                System.out.println(index2);

                StringBuffer output = new StringBuffer("");

                if (index != -1 && index2 != -1){


                    for (int b = index+1;b <= index2-1;b++){
                        output.append(temp.charAt(b));
                    }


                }

                System.out.println(output);

            }

        }
    }
}
