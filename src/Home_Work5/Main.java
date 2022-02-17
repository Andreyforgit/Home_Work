package Home_Work5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Сортировка через Collections.sort
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            list.add(new Double((Math.random()*Integer.MAX_VALUE)/10000).intValue() );
        }
        Date startDate = new Date();
        Collections.sort(list);
        Date finishDate = new Date();
        long duration = finishDate.getTime() - startDate.getTime();
        System.out.println(list);
        System.out.println("Сортировка через Collections.sort " + duration + "ms");

        //Сортировка пузырьком
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            list1.add(new Double((Math.random()*Integer.MAX_VALUE)/10000).intValue() );
        }
        Date startDate1 = new Date();
        boolean isSorted = false;
        int buf;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < list1.size()-1; i++) {
                if(list1.get(i) > list1.get(i + 1)){
                    isSorted = false;
                    buf = list1.get(i);
                    list1.set(i, list1.get(i+1));
                    list1.set(i+1, buf);
                }
            }
        }
        Date finishDate1 = new Date();
        long duration1 = finishDate1.getTime() - startDate1.getTime();
        System.out.println(list1);
        System.out.println("Сортировка пузырьком " + duration1 + "ms");

        //Сортировка выбором
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            list2.add(new Double((Math.random()*Integer.MAX_VALUE)/10000).intValue() );
        }
        Date startDate2 = new Date();
        for (int i = 0; i < list2.size(); i++) {
            int pos = i;
            int min = list2.get(i);

            for (int j = i + 1; j < list2.size(); j++) {
                if(list2.get(j)< min){
                    pos = j;
                    min = list2.get(j);
                }
            }
            list2.set(pos,list2.get(i));
            list2.set(i,min);
        }
        Date finishDate2 = new Date();
        long duration2 = finishDate2.getTime() - startDate2.getTime();
        System.out.println(list2);
        System.out.println("Сортировка выбором " + duration2 + "ms");
    }
}
