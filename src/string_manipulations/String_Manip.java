package string_manipulations;

import java.text.DecimalFormat;

public class String_Manip {
	
	public static void main(final String[] args) {
        final String str = "I have a very bad fate";
        System.out.println(str.substring(str.indexOf("bad") + 4, str.length()));
        final String str2 = "SUMIT;MISHRA;29;MCA";
        final String[] arr = str2.split(";");
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
        final String data = "xXtestingXxXxJavaxXselenium";
        final String[] arr2 = data.split("xX");
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        final String x = "100";
        System.out.println(Integer.parseInt(x) + 20);
        final String y = "200A";
        System.out.println(Integer.parseInt(y.split("A")[0].trim()) + 20);
        final int a = 1000;
        System.out.println(String.valueOf(String.valueOf(a)) + 20);
        final String abx = " $122.00";
        final String[] abx2 = abx.split("$");
        System.out.println(abx2[0]);
        final double n = 10.0;
        final double m = 1000.0;
        final double sum = n * m;
        System.out.println("Sum is " + sum);
        final DecimalFormat formatter = new DecimalFormat("#,###.00");
        final String tot = formatter.format(sum);
        System.out.println(tot);
        final String tot2 = "$" + tot;
        System.out.println(tot2);
        final double lll = 100.0;
        final String llll = "$";
        System.out.println(String.valueOf(llll) + lll);
        final String name = "Sumit";
        final String names = "Sumit";
        System.out.println(name == names);
        System.out.println(names.equals(names));
        final String name2 = new String("Sumit");
        final String name3 = new String("Sumit");
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));
        final String str3 = "Hello World";
        System.out.println(str3.replace(" ", ""));
        final String str4 = "$1,000.00";
        final String str5 = str4.substring(1, str4.length());
        System.out.println(str5);
        final String str6 = "i am getting frustrated";
        final String[] str7 = str6.split(" ");
        String[] array;
        for (int length = (array = str7).length, k = 0; k < length; ++k) {
            final String j = array[k];
            System.out.println(j);
        }
    }

}
