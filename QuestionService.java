import java.util.Scanner;

public class QuestionService {
    
    Question[] question = new Question[4];
    String[] selection = new String[4];

    QuestionService(){
        question[0]= new Question(1,"Size of int?", "1", "2", "3", "4", "4");
        question[1]= new Question(2,"Size of double?", "2", "4", "8", "16", "8");
        question[2]= new Question(3,"Size of float?", "1", "2", "3", "4", "4");
        question[3]= new Question(4,"Size of boolean?", "1", "2", "3", "4", "1");
    };

    public void playQuiz(){
        int i = 0;
        //advanced for loop.
       for(Question q: question){

        System.out.println("Question no: " + q.getId());
        System.out.println(q.getQuestion());
        System.out.println("Option: " + q.getOpt1());
        System.out.println("Option: " + q.getOpt2());
        System.out.println("Option: " + q.getOpt3());
        System.out.println("Option: " + q.getOpt4());

        Scanner scanner = new Scanner(System.in);
        selection[i] = scanner.nextLine();
        i++;
       }

       for(String s : selection){
        System.out.println(s);
       }
    }

}
