"use strict";
// 1. Type Annotations And Any Data Type
Object.defineProperty(exports, "__esModule", { value: true });
class Collection {
    data = [];
    add(item) {
        this.data.push(item);
    }
}
let itemOne = new Collection();
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
let itemTwo = new Collection();
itemTwo.add({
    itemType: "Game",
    title: "Flatout",
    style: "Racing",
    price: 20
});
itemTwo.add({
    itemType: "Game",
    title: "Elden ring",
    style: "souls",
    price: 69
});
console.log(itemTwo);
//# sourceMappingURL=index.js.map