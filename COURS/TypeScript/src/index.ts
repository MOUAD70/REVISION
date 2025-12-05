// 1. Type Annotations And Any Data Type

// let name: string = "MOUAD";
// let age: number = 20;
// let isStudent: boolean = true;
// let all: any = "Elzero Web School";

// function add(n1: number, n2: number) : number {
//     return n1 + n2;
// }

// console.log(add(10, 20));
// console.log(typeof add(10, 20));

// 2. Type Annotations With Arrays

// let all: string | number | boolean = "osama";

// all = "A";
// all = 100;
// all = true;

// let fruits: string[] = ["Apple", "Strawberry", "Orange"];

// for (let i = 0; i < fruits.length; i++) {
//     console.log(fruits[i]?.repeat(3));
// }

// 3. Type Annotations With Multidimensional Arrays

// let arrayOne: number[] = [1, 2, 3, 4, 5];
// let arrayTwo: string[] = ["A", "B", "C"];
// let arrayThree: (string | number)[] = [1, 2, 3, "A", "B", "C"];

// let arrayFour: (string | number | boolean | (string | number[])[])[] = [1, 2, 3, 4, "A", "B", ["C", "D", [5, 6, 7, 8]], true, false];

// 4. Type Annotations With Function

// let showMsg = true;

// function showDetails(name: string, age: number, salary: number) : string {
//     if (showMsg) {
//         return `Hello ${name}, Age is ${age}, Salary is ${salary}$`;
//     }
//     return `No data to show`;
// }

// console.log(showDetails("MOUAD", 20, 8000));

// 5. Function Optional and Default

// function showData(name: string, age: number, country?: string) : string {
//     return `${name} - ${age} - ${country}`;
// }

// console.log(showData("MOUAD", 20));

// 6. Function Rest Parameter

// function addAll(...nums: number[]) : number{
//     let result = 0;
//     // METHOD 1:

//     // for (let i = 0; i < nums.length; i++) {
//     //     result += nums[i]!;
//     // }

//     // METHOD 2:

//     nums.forEach((num) => result += num);

//     return result;
// }

// console.log(addAll(1, 2, 3, 4, 5, +true));

// 7. Type Annotations With Anonymous And Arrow Function

// const add = function(num1: number, num2: number) : number {
//     return num1 + num2;
// }

// console.log(add(10, 20));

// const addWithArrow = (num1: number, num2: number) : number => num1 + num2;

// console.log(addWithArrow(10, 20));

// 8. Data Types - Type Alias

// type str = string;

// let name: str = "mouad";
// console.log(name);
// console.log(typeof name);

// type strNum = string | number;

// let all: strNum = "ALL";
// console.log(all);
// console.log(typeof all);

// all = 299;
// console.log(all);
// console.log(typeof all);

// 9. Data Types - Type Alias Advanced

// type Buttons = {
//     up: string,
//     down: string,
//     right: string,
//     left: string,
// }

// type Last = Buttons & {
//     x: string,
// }

// function getActions(btns: Last) {
//     console.log(`Action For Button "UP": ${btns.up}`);
//     console.log(`Action For Button "DOWN": ${btns.down}`);
//     console.log(`Action For Button "RIGHT": ${btns.right}`);
//     console.log(`Action For Button "LEFT": ${btns.left}`);
//     console.log(`Action For Button "X": ${btns.x}`);
// }

// getActions({up: "Accelerate", down: "Slow Down | Move Backward", right: "Go right", left: "Go left", x: "Nitro"});

// 10. Data Types - Literal Types

// type nums = 0 | 1 | -1;

// function compare(num1: number, num2: number) : nums {
//     if (num1 === num2) {
//         return 0;
//     } else if (num1 > num2) {
//         return 1;
//     } else {
//         return -1;
//     }
// }

// console.log(compare(20, 20));
// console.log(compare(20, 15));
// console.log(compare(20, 30));

// 11. Data Types - Tuples

// let manga: readonly [number, string, boolean] = [100, "Berserk", true];

// manga = [10, "Vagabond", true];
// // manga.push(100);

// console.log(manga);

// const [id, title, isPublished] = manga;

// console.log(id);
// console.log(title);
// console.log(isPublished);

// 12. Data Types - Void And Never

// function loggIn(msg: string) : void {
//     console.log(msg);
// }

// console.log(loggIn("Hi there!"));

// const fail = (msg: string) : never => {
//     throw new Error(msg);
// }

// console.log(fail);

// 13. Data Types - Enums

// // INSTEAD OF ADDING CONSTANT LIKE THAT WHICH TAKES MORE TIME AND MORE COMPLEX TO RIGHT
// const KIDS = 15;
// const EASY = 9;
// const MEDIUM = 6;
// const HARD = 3;

// // WE CAN JUST GROUP THEM IN ENUMS
// enum Kids {
//     Five = 25,
//     Seven = 20,
//     Ten = 15,
// }

// const enum Levels {
//     Kid = Kids.Ten,
//     Easy = 9,
//     Medium = 6,
//     Hard = 3,
// }

// let lvl: string = "Easy";

// if (lvl.toLowerCase() === "easy") {
//     console.log(`The level is ${lvl} and Number of secs is ${Levels.Easy}seconds`);
// }

// 14. Data Types - Type Assertions

// let myImg = document.getElementById("my-img") as HTMLImageElement; // Interface
// let myImg = <HTMLImageElement> document.getElementById("my-img");
// console.log(myImg.src);

// let data: any = 1000;
// console.log((data as string).repeat(2));

// 15. Union And Intersection Types

// let all: number | string = 100;

// type A = {
//     one: string,
//     two: number,
//     three: boolean,
// }

// type B = {
//     four: number,
// }

// type C = {
//     five: boolean,
// }

// type Mix = A & C;

// function getActions(btns: Mix) {
//     console.log(`Hello ${btns.one}`);
//     console.log(`Hello ${btns.two}`);
//     console.log(`Hello ${btns.three}`);
// }

// getActions({ one: "QWERTY", two: 123, three: true, five: false });

// 16. Type Annotations With Object

// let myObject: {
//     readonly username: string,
//     id: number,
//     isStudent?: boolean,
//     skills: {
//         one: string,
//         two: string,
//         three: string
//     }
// } = {
//     username: "Mouad",
//     id: 1,
//     skills: {
//         one: "HTML",
//         two: "CSS",
//         three: "JS"
//     }
// }


// console.log(myObject.username);

// 17. Interface Declaration

// interface User {
//     id: number,
//     username: string,
//     country: string,
// }

// let user: User = {
//     id: 100,
//     username: "Mouad",
//     coutnry: "MOROCCO"
// }

// console.log(user);

// 18. Interface Method And Parameters

// interface User {
//     id: number,
//     username: string,
//     country: string,
//     sayHello(): string,
//     sayWelcome: () => string,
//     getDouble(num: number): number
// }

// let user: User = {
//     id: 100,
//     username: "Mouad",
//     country: "MOROCCO",
//     sayHello() {
//         return `Hello ${user.username}`
//     },
//     sayWelcome: () => {
//         return `Welcome ${user.username}`
//     },
//     getDouble(num) {
//         return num * 2
//     },
// }

// console.log(user);

// 19. Interface Reopen And Use Cases

// interface Settings {
//     theme: boolean,
//     font: string
// }

// interface Settings {
//     sidebar: boolean
// }

// interface Settings {
//     external: boolean
// }

// let userSettings: Settings = {
//     theme: true,
//     font: "Open sans",
//     sidebar: false,
//     external: true
// }

// 20. Interface Extend

// interface User {
//     id: number,
//     username: string,
//     country: string
// }

// interface Moderator extends User {
//     role: string | number
// }

// interface Admin extends User, Moderator {
//     protect: boolean
// }

// let user: Admin = {
//     id: 100,
//     username: "MOUAD",
//     country: "Egypt",
//     role: "Admin",
//     protect: true
// }

// console.log(user.id)

// 21. Class Type Annotations

// class User {
//     username: string;
//     salary: number;
//     msg: () => string;
//     constructor(username: string, salary: number) {
//         this.username = username;
//         this.salary = salary;
//         this.msg = function () {
//             return `Hello ${this.username} your salary is ${this.salary}`;
//         }
//     }
//     sayMsg() {
//         return `Hello ${this.username} your salary is ${this.salary}`;
//     }
// }

// let userOne = new User("Mouad", 6000);

// console.log(userOne.username);
// console.log(userOne.salary);
// console.log(userOne.msg());
// console.log(userOne.sayMsg());

// 22.  Class Access Modifiers And Parameters Properties + Getters and Setters

// class User {
//     msg: () => string;
//     constructor(private _username: string, public salary: number, public readonly address: string) {
//         this.msg = function () {
//             return `Hello ${this._username} your salary is ${this.salary}`;
//         }
//     }
//     sayMsg() {
//         return `Hello ${this._username} your salary is ${this.salary}`;
//     }

//     get username() : string {
//         return this._username;
//     }

//     set username(value: string) {
//         this._username = value;
//     }
// }

// let userOne = new User("Mouad", 7000, "Sale");

// console.log(userOne.salary);
// console.log(userOne.msg());
// console.log(userOne.sayMsg());

// 23. Class Static Members

// class User {
//     private static created: number = 0;
//     static getCount() : void {
//         console.log(`${this.created} Objects Created`)
//     }

//     constructor(public username: string) {
//         User.created++;
//     }
// }

// let u1 = new User("Mouad");
// let u2 = new User("Simo");
// let u3 = new User("Ilias");

// User.getCount();

// 24. Class Implements Interface

// interface Settings {
//     theme: boolean;
//     font?: string;
//     save(): void;
// }

// class User implements Settings {
//     constructor(public username: string, public theme: boolean) { }
//     save(): void {
//         console.log("Saved");
//     }

//     update(): void {
//         console.log("Updated");
//     }
// }

// let userOne = new User("Elzero", true);

// 25. Abstract Classes And Members

// abstract class Food {
//     constructor(public title: string) { }
//     abstract getCookingTime(): void;
// }

// class Pizza extends Food {
//     constructor(public title: string, public price: number) {
//         super(title);
//     }
//     getCookingTime(): void {
//         console.log("Cooking time is 1h (Pizza)");
//     }
// }

// class Burger extends Food {
//     getCookingTime(): void {
//         console.log("Cooking time is 30min (Burger)");
//     }
// }

// 26. Polymorphism And Method Override

// class Player {
//     constructor(public name: string) { }
//     attack(): void {
//         console.log("Attacking now");
//     }
// }

// class Amazon extends Player {
//     constructor(name: string, public spears: number) {
//         super(name);
//     }
//     override attack(): void {
//         console.log("Attacking with spear");
//         this.spears -= 1;
//     }
// }


// class Barbarien extends Player {
//     constructor(name: string, public axeDurability: number) {
//         super(name);
//     }
//     override attack(): void {
//         console.log("Attacking with axe");
//         this.axeDurability -= 1;
//     }
// }

// 27. Generics

// function returnType<T>(value: T) : T {
//     return value;
// }

// console.log(returnType<number>(100));
// console.log(returnType<string>("Mouad"));
// console.log(returnType<boolean>(true));
// console.log(returnType<number[]>([1, 2, 3, 4]));

// 28. Generics Multiple Types

// const returnTypeArrowSyntax = <T>(value: T): T => value;

// function testType<T, S>(value: T, secValue: S): string {
//     return `The value is ${value} And The second value is ${secValue}`;
// }

// console.log(testType<number, boolean>(100, false));

// 29.  Generics Classes

// class User<T = string> {
//     constructor(public value: T){}
//     show(msg: T) : void {
//         console.log(`${msg} - ${this.value}`);
//     }
// }

// let userOne = new User<number | string>("Mouad");

// userOne.show("Salam ana smiti");

// 30. Generics And Interfaces

interface Book {
    itemType: string;
    title: string;
    isbn: number;
}

interface Game {
    itemType: string;
    title: string;
    style: string;
    price: number;
}

class Collection<T> {
    public data: T[] = [];
    add(item: T): void {
        this.data.push(item);
    }
}

let itemOne = new Collection<Book>();

itemOne.add({
    itemType: "Manga",
    title: "Berserk",
    isbn: 274648,
});

itemOne.add({
    itemType: "Manga",
    title: "Vagabod",
    isbn: 563927,
});

console.log(itemOne);

let itemTwo = new Collection<Game>();

itemTwo.add({
    itemType: "Game",
    title: "Flatout",
    style: "Racing",
    price: 20
})

itemTwo.add({
    itemType: "Game",
    title: "Elden ring",
    style: "souls",
    price: 69
})

console.log(itemTwo);