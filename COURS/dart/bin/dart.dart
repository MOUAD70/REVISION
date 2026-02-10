void main(List<String> arguments) {
  // Variables:

  // var name = "MOUAD";

  //  A final variable:
  //  Can only be assigned once
  //  But the value is decided when the program runs
  // final age = 25;
  // age = 28;

  //  A const variable:
  //  Must be known before the program runs
  //  Immutable forever
  //  Stored directly in memory (very fast)
  // const isOpen = true;
  // isOpen = false;

  // Math Operations:

  // var name = "MOUAD";
  // print("My name's $name");

  // const age = 25;
  // print(age);

  // print(age + 5);
  // print(age - 5);
  // print(age * 5);
  // print(age / 5);
  // print(age % 5);

  // Type Annotations:

  // const String name = "MOUAD";
  // print(name);

  // int age = 20;
  // print(age);

  // bool isStudent = true;
  // print(isStudent);

  // double GPA = 3.2;
  // print(GPA);

  // // Init as null variable
  // int? points;
  // print(points);

  // Functions:

  // String greet(String name, int age) {
  //   return "Hi There, My name's $name and i'm $age years old";
  // }

  // print(greet("MOUAD", 20));

  // named parameters

  // String greet({String? name = 'Unknown', required int age}) {
  //   return "Hi There, My name's $name and i'm $age years old";
  // }

  // print(greet(name: "MOUAD", age: 20));
  // print(greet(age: 20, name: "MOUAD"));
  // print(greet(age: 20));

  // Lists and Sets:

  // List<int> numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  // List<String> fruits = ["Apple", "Orange", "Strawberry", "Coconut"];

  // print(numbers[0]);
  // print(fruits[0]);

  // numbers.add(11);
  // numbers.add(12);
  // print(numbers);

  // fruits.remove("Orange");
  // fruits.removeLast();
  // print(fruits);

  // numbers.shuffle();
  // print(numbers);
  // print(numbers.length);
  // print(numbers.indexOf(10));

  // Set<String> names = {"mario", "luigi", "peach"};

  // names.add("bowser");
  // // "peach" would not be added
  // names.add("peach");
  // names.remove("luigi");
  // print(names);
  // print(names.length);

  // Control Flow:

  List<int> numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  // for (int i = 0; i < numbers.length; i++) {
  //   print("The current value of i is $i, the value of the element in the numbers array is ${numbers[i]} ");
  // }

  // for (int number in numbers) {
  //   if (number > 5) {
  //     print("The number is $number");
  //   }
  // }


  // This is cool!
  for (int number in numbers.where((num) => num > 5)) {
    print("The number is $number");
  }
}
