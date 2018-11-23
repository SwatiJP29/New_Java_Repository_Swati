let person = {
    age: 22,
    name:'rash'
}
let handler = {
    get: function (target, name) {

        return name in target ? target[name] : 'Not existant';
    },
    set: function (target, property, value) {
        if (value.length >= 2) {
            Reflect.set(target, property, value);
        }
    }
};

var proxy = new Proxy(person, handler);
proxy.name='Rashmi';
console.log(proxy.name);

