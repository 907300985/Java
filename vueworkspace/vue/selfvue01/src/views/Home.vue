<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/l.png" />
    <HelloWorld msg="请注册你的英雄联盟账号:" />
    <el-button type="success" round>成功按钮</el-button>
    <el-button type="failed" round>失败按钮</el-button>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    HelloWorld
  }
}
</script>
