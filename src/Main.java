import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Привет, этот квест предназначен для определения твоего уровня математики :)\n" +
                "Так что будь внимателен и обдумывай все тщательно.\n" +
                "Да пребудет с тобой сила!\n" +
                "Забыл предупредить, ответ должен быть цифрой.");
        int mark = 0;
        System.out.println("Первый вопрос:\n" +//ПЕРВЫЙ ПУНКТ
                "Какое значение имеет следующее выражение?\n" +
                "(2+4)*2/2\n" +
                "1) 12\n" +
                "2) 6\n" +
                "3) 4\n" +
                "4) 2");
        int answer1 = in.nextInt();
        switch (answer1) {
            case 1: {
                System.out.println("Я полагаю, что ты попался на невнимательности, сосредоточься!");
                break;
            }
            case 2: {
                System.out.println("Молодец, ты заработал балл.");
                mark += 1;
                break;
            }
            case 3: {
                System.out.println("Я полагаю, что ты попался на невнимательности, сосредоточься!");
                break;
            }
            case 4: {
                System.out.println("Я полагаю, что ты попался на невнимательности, сосредоточься!");
                break;
            }
            default: {
                System.out.println("Что-то пошло не так, идем дальше.");
            }
        }
        System.out.println("Второй вопрос:\n" +//ВТОРОЙ ПУНКТ
                "Какое значение имеет следующее выражение?\n" +
                "5^3(5 в 3 степени)\n" +
                "1) 25\n" +
                "2) 75\n" +
                "3) 100\n" +
                "4) 125");
        int answer2 = in.nextInt();
        switch (answer2) {
            case 1: {
                System.out.println("Соберись, а то получишь низкую оценку!");
                break;
            }
            case 2: {
                System.out.println("Соберись, а то получишь низкую оценку!");
                break;
            }
            case 3: {
                System.out.println("Соберись, а то получишь низкую оценку!");
                break;
            }
            case 4: {
                System.out.println("Молодец, ты заработал балл.");
                mark += 1;
                break;
            }
            default: {
                System.out.println("Что-то пошло не так, идем дальше.");
            }
        }
        System.out.println("Третий вопрос:\n" +//ТРЕТИЙ ПУНКТ
                "Какое значение имеет следующее выражение?\n" +
                "√49\n" +
                "1) 7\n" +
                "2) 6\n" +
                "3) 8\n" +
                "4) 9");
        int answer3 = in.nextInt();
        switch (answer3) {
            case 1: {
                System.out.println("Молодец, ты заработал балл.");
                mark += 1;
                break;
            }
            case 2: {
                System.out.println("Ошибки случаются)");
                break;
            }
            case 3: {
                System.out.println("Ошибки случаются)");
                break;
            }
            case 4: {
                System.out.println("Ошибки случаются)");
                mark += 1;
            }
            default: {
                System.out.println("Что-то пошло не так, идем дальше.");
            }
        }
        System.out.println("Четвертый вопрос:\n" +//ЧЕТВЕРТЫЙ ПУНКТ
                "Какое значение имеет следующее выражение?\n" +
                "4!(факториал 4)\n" +
                "1) 16\n" +
                "2) 12\n" +
                "3) 24\n" +
                "4) 20");
        int answer4 = in.nextInt();
        switch (answer4) {
            case 1: {
                System.out.println("Fail:)Но ничего страшного, осталось еще чуть-чуть:)");
                mark += 1;
            }
            case 2: {
                System.out.println("Fail:)Но ничего страшного, осталось еще чуть-чуть:)");
                break;
            }
            case 3: {
                System.out.println("Молодец, ты заработал балл.");
                mark += 1;
                break;
            }
            case 4: {
                System.out.println("Fail:)Но ничего страшного, осталось еще чуть-чуть:)");
                mark += 1;
            }
            default: {
                System.out.println("Что-то пошло не так, идем дальше.");
            }
        }
        System.out.println("Пятый и самый сложный вопрос:\n" +//ПЯТЫЙ ПУНКТ
                "Какое значение имеет следующее выражение?\n" +
                "(2+4)*2/2+5^3+√49+4!\n" +//6+125+7+24
                "1) 160\n" +
                "2) 162\n" +
                "3) 154\n" +
                "4) 158");
        int answer5 = in.nextInt();
        switch (answer5) {
            case 1: {
                System.out.println("Хоть ответ и неправильный, но ты уже дошел до конца :)Мои поздравления!!!");
                break;
            }
            case 2: {
                System.out.println("Молодец, ты заработал балл и дошел до конца квеста:)Мои поздравления!!!");
                mark += 1;
                break;
            }
            case 3: {
                System.out.println("Хоть ответ и неправильный, но ты уже дошел до конца :)Мои поздравления!!!");
                mark += 1;
            }
            case 4: {
                System.out.println("Fail:)Хоть ответ и неправильный, но ты уже дошел до конца :)Мои поздравления!!!");
                mark += 1;
            }
            default: {
                System.out.println("Что-то пошло не так.");
            }
        }
        if (mark == 5) {
            System.out.println("Молодец, ты получил наивысший балл '5'!У тебя отличные знания математики :)");
        } else if (mark == 4) {
            System.out.println("Ты хорошо справился, твоя оценка'4'.У тебя хорошие знания математики :)");
        } else if (mark == 3) {
            System.out.println("Неплохой результат, но можно было и лучше :)Тройка");
        } else if (mark == 2) {
            System.out.println("Хьюстон, у нас проблемы!Двояк");
        } else if (mark == 1) {
            System.out.println("Обнаружен очень низкий уровень математики, срочно заниматься!!!Один балл, ужас...");
        } else if (mark == 0) {
            System.out.println("Все очень плохо...'0' баллов, как так можно...");
        }
    }
}
