package com.itp.dailyhunt;

public class ColorPicker {
    String[] colors = new String[]{   "#90A4AE", "#BCAAA4", "#FFAB91", "#FFE082", "#B9F6CA", "#81D4FA", "#80CBC4","#B39DDB","#F48FB1"};


    String[] colors1 = new String[]{"#37474F", "#4E342E", "#FF5722", "#FF6F00","#00C853", "#0277BD", "#00695C","#4527A0","#AD1457"};

    int colorIndex = 1;
    int colorIndex1 = 1;

            public String getColor()
            {
                return colors[colorIndex++ % colors.length];
            }
            public String getColor1()
            {
                return colors1[colorIndex1++ % colors1.length];
            }

}
