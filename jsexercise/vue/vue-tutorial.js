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
        seen: true,
        score: 90
    }
});
var app4 = new Vue({
    el: '#app-4',
    data: {
        todos: [
            {text: '学习 JavaScript'},
            {text: '学习 Vue'},
            {text: '整个牛项目'}
        ],
        person: {
            name: '梁煜东',
            nickName: 'jufeng98'
        }
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

// 定义一个名为 button-counter 的新组件
Vue.component('button-counter', {
    //这里必须是一个函数,否则所有实例会共享这个data
    data: function () {
        return {
            count: 0
        }
    },
    template: '<button v-on:click="count++">You clicked me {{ count }} times.</button>'
});
var appK = new Vue({
    el: '#app-K'
});

Vue.component('blog-post', {
    props: ['title'],
    template: '<h3>{{ title }}<slot></slot></h3>'
});
var appG = new Vue({
    el: '#app-G',
    data: {
        posts: [
            {id: 1, title: 'My journey with Vue'},
            {id: 2, title: 'Blogging with Vue'},
            {id: 3, title: 'Why Vue is so fun'}
        ],
        postFontSize: 1
    }
});

Vue.component('blog-post-multi', {
    props: ['title'],
    template: '<div><header>{{ title }}<slot name="slot1"></slot></header>' +
        '<section>{{ title }}<slot></slot></section>' +
        '<footer>{{ title }}<slot name="slot2">default text</slot></footer></div>'
});
var appL = new Vue({
    el: '#app-L'
});

Vue.component('custom-input', {
    props: ['value'],
    template: `
    <input
      v-bind:value="value"
      v-on:input="$emit('input', $event.target.value)"
    >
  `
});
var appH = new Vue({
    el: '#app-H',
    data: {
        searchText: ''
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

Vue.component('todo-item-slot', {
    props: ['todo'],
    template: '<li v-bind:key="todo.id">' +
        '        <slot v-bind:todo="todo">' +
        '          {{ todo.text }}' +
        '        </slot>' +
        '      </li>'
});
var app7a = new Vue({
    el: '#app-7a',
    data: {
        groceryList: [
            {id: 0, text: '蔬菜', isComplete: false},
            {id: 1, text: '奶酪', isComplete: false},
            {id: 2, text: '随便其它什么人吃的东西', isComplete: true}
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
        showCurrentText: function (word, event) {
            let clickText = event.target.innerHTML;
            let text = `text:${word} ${clickText}`;
            alert(text);
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
    computed: {
        fullName: {
            get() {
                return this.firstName + ' ' + this.lastName;
            },
            set(newValue) {
                this.firstName = newValue.split(" ")[0];
                this.lastName = newValue.split(" ")[1];
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

var app13a = new Vue({
    el: '#app-13-a',
    data: {
        message: '',
        multiMessage: '',
        checked: false,
        checkedNames: [],
        picked: 'One',
        selected: '',
        selectedd: 'A',
        options: [
            {text: 'One', value: 'A'},
            {text: 'Two', value: 'B'},
            {text: 'Three', value: 'C'}
        ],
        age: 12
    }
});

var app14 = new Vue({
    el: '#app-14',
    data: {
        activeRed: true,
        activeGreen: false,
        classObj: {
            red: false,
            green: true
        }
    },
    computed: {
        classObject() {
            return {
                activeRed: !this.activeGreen,
                newClass: 'newCla'
            }
        }
    }
});

var app15 = new Vue({
    el: '#app-15',
    data: {
        loginType: 'username'
    },
    methods: {
        change() {
            this.loginType = this.loginType === 'username' ? 'email' : 'username';
        }
    }
});

var app16 = new Vue({
    el: '#app-16',
    data: {
        ok: true
    },
    methods: {
        change() {
            this.ok = !this.ok;
        }
    }
});

// import {componentA} from './components/componentA';
// var app17 = new Vue({
//     el: '#app-17',
//     components: {
//         'component-a': componentA
//     }
// });

Vue.component('my-component', {
    props: {
        // 基础的类型检查 (`null` 匹配任何类型)
        propA: Number,
        // 多个可能的类型
        propB: [String, Number],
        // 必填的字符串
        propC: {
            type: String,
            required: true
        },
        // 带有默认值的数字
        propD: {
            type: Number,
            default: 100
        },
        // 带有默认值的对象
        propE: {
            type: Object,
            // 对象或数组默认值必须从一个工厂函数获取
            default: function () {
                return {message: 'hello'}
            }
        },
        // 自定义验证函数
        propF: {
            validator: function (value) {
                // 这个值必须匹配下列字符串中的一个
                return ['success', 'warning', 'danger'].indexOf(value) !== -1
            }
        }
    },
    template: '<p :class="propC">{{propF}}</p>'
});

var app18 = new Vue({
    el: '#app-18'
});

var app19 = new Vue({
    el: '#app-19',
    data:{
        date:1542461415308
    },
    computed: {
        time() {
            return Date.now();
        }
    },
    filter:{
        formatDate(){
        }
    }
});