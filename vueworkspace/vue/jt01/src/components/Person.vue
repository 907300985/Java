<template>
  <div>
    <h1 style="text-align: center;">{{msg}}</h1>
    <el-button type="primary">主要按钮</el-button>
    <el-button type="danger">危险按钮</el-button>
    <i class="el-icon-edit"></i>
    <i class="el-icon-share"></i>
    <i class="el-icon-delete"></i>

    <el-input v-model="input" placeholder="请输入内容"></el-input>
  </div>
</template>

<script>
  export default{
    name:'Person',
    data(){
      return{
        msg:'Welcome to the League of Legends',
        input:''
      }
    }
  }
</script>

<style>
</style>
