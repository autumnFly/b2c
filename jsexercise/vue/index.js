console.log(Math.random());
var app = new Vue({
    el: '#app',
    data: {
        message: 'Hello Vue!'
    }
});
var app2 = new Vue({
    el: '#app-2',
    data: {
        message: '页面加载于 ' + new Date().toLocaleString()
    }
});
var app3 = new Vue({
    el: '#app-3',
    data: {
        seen: true
    }
});
var app4 = new Vue({
    el: '#app-4',
    data: {
        todos: [
            {text: '学习 JavaScript'},
            {text: '学习 Vue'},
            {text: '整个牛项目'}
        ]
    }
});
var app5 = new Vue({
    el: '#app-5',
    data: {
        message: 'Hello Vue.js!'
    },
    methods: {
        reverseMessage: function () {
            this.message = this.message.split('').reverse().join('')
        }
    }
});
var app6 = new Vue({
    el: '#app-6',
    data: {
        message: 'Hello Vue!'
    }
});
// 定义名为 need-item 的新组件
Vue.component('need-item', {
    template: '<li>这是个待办项</li>'
});
var appS = new Vue({
    el: '#app-S',
    data: {
        message: 'Hello Vue!'
    }
});
Vue.component('todo-item-in', {
    props: ['todo'],
    template: '<li>{{ todo.text }}</li>'
});

var app7 = new Vue({
    el: '#app-7',
    data: {
        groceryList: [
            {id: 0, text: '蔬菜'},
            {id: 1, text: '奶酪'},
            {id: 2, text: '随便其它什么人吃的东西'}
        ]
    }
});

var app8 = new Vue({
    el: '#app-8',
    data: {
        rawHtml: '<span style="color:red;">this is red</span>'
    }
});

var app9 = new Vue({
    el: '#app-9',
    data: {
        liId: 'uniqueLi',
        liDisabled: 'disabled'
    }
});

var app10 = new Vue({
    el: '#app-10',
});

var app11 = new Vue({
    el: '#app-11',
    methods: {
        showCurrentText: function (e) {
            alert("text:" + this.$el.innerText);
        }
    }
});

var app12 = new Vue({
    el: '#app-12',
    data: {
        firstName: "梁",
        lastName: "煜东",
        name: "梁煜东"
    },
    watch: {
        firstName: function (val) {
            this.name = val + " " + this.lastName;
        },
        lastName: function (val) {
            this.name = this.firstName + " " + val;
        }
    },
    methods: {
        updateText: function (e) {
            if (e.target.id === 'first') {
                this.firstName = e.target.value;
            } else {
                this.lastName = e.target.value;
            }
        }
    }
});

var app13 = new Vue({
    el: '#app-13',
    data: {
        question: '',
        answer: 'I cannot give you an answer until you ask a question!'
    },
    watch: {
        question: function (newQuestion, oldQuestion) {
            this.answer = 'Waiting for you to stop typing...';
            //做点什么好呢
        }
    },
});