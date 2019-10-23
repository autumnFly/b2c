<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Essential Links</h2>
    <ul>
      <li v-for="item in bannerList" :key="Math.random()">{{item.webUrl}}</li>
    </ul>
  </div>
</template>
<script>

  import baseAxios from '../../common/baseRequest'
  import config from '../../config'

  export default {
    name: 'HelloWorld',
    data() {
      return {
        msg: 'Welcome to Your Vue.js App',
        bannerList: []
      }
    },
    methods: {
      getBannerList() {
        baseAxios.get(config.GET_BANNER_LIST_URL).then((resJson) => {
          this.bannerList = resJson.bannerList;
        })
      }
    },
    mounted() {
      this.getBannerList()
    },
  }
</script>
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
