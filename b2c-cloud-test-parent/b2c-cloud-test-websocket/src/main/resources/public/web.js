/**
 * Created by yu on 2017/11/10.
 */
var url = "ws://localhost:9600/macro";
var sock = new WebSocket(url);
sock.onopen = function () {
    console.log("open");
    sayMacro();
};
sock.onclose = function () {
    console.log("close");
}
sock.onmessage = function (e) {
    console.log("receive:" + e.data+" from java");
    setTimeout(sayMacro, 2000);
}
function sayMacro() {
    console.log("send macro to java!");
    sock.send("send macro to java!");
}