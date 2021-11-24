<template>
  <div id="app">

    <img src="./assets/l.png" style="border-radius: 10px; ">

    <Person></Person>

    <Student></Student>

    <p style="font-size: 30px;">
      <router-link to="/t1">t1模式</router-link>
      <router-link to="/t2">t2模式</router-link>
    </p>
    <router-view/>

  </div>
</template>

<script>
  //导入指定的自定义组件
  import Person from "./components/Person.vue"
  import Student from "./components/Student.vue"
  export default {
    name: 'App',
    components:{//添加组件
      Person,
      Student
    }
  }
  </script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
