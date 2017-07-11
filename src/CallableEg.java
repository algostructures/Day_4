import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//Callable is parameterized
class FactorialCalculator implements Callable<Integer>
{
 
    private Integer number;
 
    public FactorialCalculator(Integer number) {
        this.number = number;
    }
 
    @Override
    public Integer call() throws Exception {
        int result = 1;
        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
        System.out.println("Result for number - " + number + " -> " + result);
        return result;
    }
}


 
public class CallableEg 
{
      public static void main(String[] args) 
      {
    	  //Total number of Threads in ThreadPool is 2
          ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
           
          //create ArrayList, each element is an object of Future<Integer>
          //Future class holds the result returned by call method of Callable interface
          List<Future<Integer>> resultList = new ArrayList<Future<Integer>>();
           
          Random random = new Random();
           
          for (int i=0; i<4; i++)
          {
              Integer number = random.nextInt(10);
              FactorialCalculator calculator  = new FactorialCalculator(number);
              Future<Integer> result = executor.submit(calculator);
              //above result is returned by call() method implemented by class which implements Callable
              
              resultList.add(result);
          }
           
          for(Future<Integer> future : resultList)
          {
                try
                {
                    System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                catch(ExecutionException ee)
                {
                	ee.printStackTrace();
                }
            }
            //shut down the executor service
            executor.shutdown();
      }
}
