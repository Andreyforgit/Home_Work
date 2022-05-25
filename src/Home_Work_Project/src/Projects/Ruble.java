package Projects;

public class Ruble implements Currency{

    public String addRub(Double d, String input) {
        StringBuilder result = new StringBuilder(input);
        String s = d.toString();
        int n = s.length() - s.lastIndexOf('.');

        if (n == 2) {
            s += "0";
        }
        String[] sa = s.split("\\.");
        result.append(sa[1] + ' ');
        switch (sa[1].charAt(1)) {
            case '1':
                result.append(sa[1].charAt(0) != '1' ? "копейка" : "копеек");
                break;
            case '2':
            case '3':
            case '4':
                result.append(sa[1].charAt(0) != '1' ? "копейки" : "копеек");
                break;
            default:
                result.append("копеек");
        }
        return result.toString();
    }


}
