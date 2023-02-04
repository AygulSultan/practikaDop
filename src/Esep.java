public class Esep { public void calc(int numeric) {
    int san=10;
    int cell=numeric;
    for (; ; ) {
        if (cell>=1) {
            san = cell % 10;
            if (numeric%san==0) {

                System.out.println(numeric+" "+san+" +bolunot");
                //cell=Math.floorDiv(cell,10);
                cell=cell/10;
            }

            else {System.out.println("Bolunboyt");
                break;
            }



        }
        else {
            break;
        }
    }

}
}
