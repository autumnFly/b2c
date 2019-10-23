let promise = new Promise(function (resolve, reject) {
    console.log('Promise');
    let rand = Math.ceil(Math.random() * 1000)
    if (rand % 2 == 0) {
        resolve('success')
    } else {
        reject('failed')
    }
});
console.log("1")
promise.then(value => console.log(value))
    .catch(reason => console.log(reason))
    .finally(() => console.log("release resource"))
console.log("2")
