import Vue from 'vue'
import Router from 'vue-router'
/*
@符号表示是在本地文件系统引入文件,@代表源代码目录,一般是src,引入@的目的是避免../../此类丑陋的语法
 */
import HelloWorld from '@/components/HelloWorld'
import login from '@/pages/users/login'
import demo from '@/pages/test/demo'
import mainIndex from '@/pages/mainIndex'

Vue.use(Router)

export default new Router({
  routes: [
    {path: '/', name: 'HelloWorld', component: HelloWorld},
    {path: '/login', name: 'login', component: login},
    {path: '/demo', name: 'demo', component: demo},
    {path: '/mainIndex', name: 'mainIndex', component: mainIndex}
  ]
})
