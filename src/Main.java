public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("task 6");
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var totalWeight = boxerSecond + boxerFirst;
        System.out.println("The total weight of both bodybuilders is " + totalWeight + " kg");
        var diffWeight = boxerSecond - boxerFirst;
        System.out.println("The weight difference is " + diffWeight + " kg");

        System.out.println("task 7");
        diffWeight = boxerSecond - boxerFirst;
        System.out.println("The weight difference is " + diffWeight + " kg");
        diffWeight = boxerSecond % boxerFirst;
        System.out.println("The weight difference is " + diffWeight + " kg");

        System.out.println("task 8.1");
        var totalTime = 640;
        var personalTime = 8;
        var totalPersonal = totalTime / personalTime;
        System.out.println("Всего работников в компании — " + totalPersonal + " человек");

        System.out.println("task 8.2");
        var newPersonal = totalPersonal + 94;
        personalTime = totalTime / newPersonal;

        System.out.println("Если в компании работает " + newPersonal + " человек, то всего " + personalTime + " часов работы может быть поделено между сотрудниками");
    }
}