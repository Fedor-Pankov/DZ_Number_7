  public class Main {
      public static void main(String[] args) {
          int[] myArray = generateRandomArray();

          //Первая задача:

          int sum = 0;
          for (int i = 0; i < myArray.length; i++) {
              sum = sum + myArray[i];
          }
          System.out.printf("Сумма трат за месяц составила %s рублей \n", sum);

          //Вторая задача:

          int max = myArray[0];
          int min = myArray[0];
          for (int i = 1; i < myArray.length; i++) {
              if (min > myArray[i]) {
                  min = myArray[i];
              } else if (max < myArray[i]) {
                  max = myArray[i];
              }
          }
          System.out.printf("Минимальная сумма трат за день составила %s рублей. " +
                  "Максимальная сумма трат за день составила %s рублей \n", min, max);

          //Третья задача:

          double average = (double) sum / myArray.length;
          String averageSum = String.format("%.2f", average);
          System.out.printf("Средняя сумма трат за месяц составила %s рублей \n", average);


          //Четвёртая задача:

          char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
          for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
              System.out.print(reverseFullName[i]);

          }
      }
          public static int[] generateRandomArray () {
              java.util.Random random = new java.util.Random();
              int[] arr = new int[30];
              for (int i = 0; i < arr.length; i++) {
                  arr[i] = random.nextInt(100_00) + 100_000;
              }
              return arr;
          }
      }

