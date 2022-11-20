let bird = {
    name: "Donald",
    numLegs: 2,
};

let boat = {
    name: "Warrior",
    type: "race-boat",
};

const funModule = (function () {
    return {
        isCuteMixin: function (obj) {
            obj.first = function () {
                return obj.name;
            };
        },
        singMixin: function (obj) {
            obj.first = function () {
                return obj;
            };
        },
    };
})();

console.log(funModule);

funModule.isCuteMixin(bird);
console.log(bird.first());
