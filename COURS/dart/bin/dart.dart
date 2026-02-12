void main(List<String> arguments) async {
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

  // List<int> numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  // for (int i = 0; i < numbers.length; i++) {
  //   print("The current value of i is $i, the value of the element in the numbers array is ${numbers[i]} ");
  // }

  // for (int number in numbers) {
  //   if (number > 5) {
  //     print("The number is $number");
  //   }
  // }

  // This is cool!
  // for (int number in numbers.where((num) => num > 5)) {
  //   print("The number is $number");
  // }

  // Maps:

  // Map<int, String> names = {1: "Mouad", 2: "Ilias", 3: "Simo"};

  // names.forEach((key, value) => print("Key: $key, Value: $value"));
  // names[1] = "Saad";
  // print(names);

  // print(names.containsKey(5));
  // print(names.remove(1));
  // print(names.keys);
  // print(names.values);
  // print(names);

  // Classes:

  // var noodles = MenuItem("noodles", 5.99);
  // var pizza = Pizza(["mushrooms", "pepers"], "veg volcano", 15.99);

  // print(noodles.format());
  // print(pizza.format());

  // Method Overriding:

  // var noodles = MenuItem("noodles", 5.99);
  // var pizza = Pizza(["mushrooms", "pepers"], "veg volcano", 15.99);

  // print(noodles.format());
  // print(pizza.format());
  // print(noodles.toString());
  // print(pizza.toString());

  // Generics:

  // var noodles = MenuItem("noodles", 5.99);
  // var pizza = Pizza(["mushrooms", "pepers"], "veg volcano", 15.99);

  // // print(noodles.format());
  // // print(pizza.format());
  // // print(noodles.toString());
  // // print(pizza.toString());

  // var foods = Collection<MenuItem>("MenuItems", ['noodles', 'pizza', 'roast', 'kebab']);

  // print(foods.randomItem());

  // Async Await in Dart:

  fetchPost().then((post) => {print("${post.title} ${post.userId}")});

  final post = await fetchPost();
  print(post.title);
  print(post.userId);
}

// Classes:

// class MenuItem {
//   String? title;
//   double? price;

//   MenuItem(this.title, this.price);

//   String format() {
//     return "$title -> $price";
//   }
// }

// class Pizza extends MenuItem {
//   List<String> toppings;

//   // Pizza(this.toppings, String title, double price) : super(title, price);
//   Pizza(this.toppings, super.title, super.price);
// }

// Method Overriding

// class MenuItem {
//   String? title;
//   double? price;

//   MenuItem(this.title, this.price);

//   String format() {
//     return "$title -> $price";
//   }

//   @override
//   String toString() {
//     return format();
//   }
// }

// class Pizza extends MenuItem {
//   List<String> toppings;

//   // Pizza(this.toppings, String title, double price) : super(title, price);
//   Pizza(this.toppings, super.title, super.price);

//   @override
//   String format() {
//     var formatedTopping = 'Contains: ';

//     for (final t in toppings) {
//       formatedTopping = '$formatedTopping $t';
//     }
//     return '$title -> $price DH \n$formatedTopping';
//   }

//   @override
//   String toString() {
//     return "Instance of Pizza: $title, $price, $toppings";
//   }
// }

// Generics:

// class MenuItem {
//   String? title;
//   double? price;

//   MenuItem(this.title, this.price);

//   String format() {
//     return "$title -> $price";
//   }
// }

// class Pizza extends MenuItem {
//   List<String> toppings;

//   // Pizza(this.toppings, String title, double price) : super(title, price);
//   Pizza(this.toppings, super.title, super.price);
// }

// class Collection<T> {
//   String name;
//   List<T> data;

//   Collection(this.name, this.data);

//   T randomItem() {
//     data.shuffle();

//     return data[0];
//   }
// }

// Async Await in Dart:

Future<Post> fetchPost() {
  const delay = Duration(seconds: 3);

  return Future.delayed(delay, () {
    return Post('My Post', 123);
  });
}

class Post {
  String title;
  int userId;

  Post(this.title, this.userId);
}
