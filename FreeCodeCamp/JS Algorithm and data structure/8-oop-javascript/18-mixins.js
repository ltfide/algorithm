let bird = {
    name: "Donald",
    numLegs: 2,
};

let boat = {
    name: "Warrior",
    type: "race-boat",
};

// Only change code below this line

function glideMixin(obj) {
    obj.glide = function () {
        console.log(obj.name);
    };
}

glideMixin(bird);
bird.glide();

glideMixin(boat);
boat.glide();
