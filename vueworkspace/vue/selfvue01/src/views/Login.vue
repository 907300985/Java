<template>
  <div>
    <el-form
      :rules="rules"
      ref="LoginForm"
      :model="LoginForm"
      class="loginContainer"
    >
      <h3 class="loginTitle">系统登录</h3>

      <el-form-item prop="username">
        <el-input
          type="text"
          auto-complete="false"
          v-model="LoginForm.username"
          placeholder="请输入用户名"
        ></el-input>
      </el-form-item>

      <el-form-item prop="password">
        <el-input
          type="password"
          auto-complete="false"
          v-model="LoginForm.password"
          placeholder="请输入密码"
        ></el-input>
      </el-form-item>

      <el-checkbox v-model="checked" class="loginRemember">记住我</el-checkbox>

      <el-button type="submit" style="width: 100%" @click="submitLogin"
        >登录</el-button
      >
    </el-form>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      captchaUrl: "",
      LoginForm: {
        username: "admin",
        password: "123",
      },
      checked: true,
      rules: {
        username: [
          { required: true, message: "请输入用户名", trigger: "blur" },
        ],
        password: [{ required: true, message: "请输入密码", trigger: "blur" }],
      },
    };
  },
  methods: {
    //   submitLogin() {
    //     const url = "http://localhost:8080/axios/updateUser";
    //     const user = {
    //       username: this.$data.LoginForm.username,
    //       password: this.$data.LoginForm.password,
    //     };
    //     this.axios.post(url, user).then((promise) => {
    //       console.log(promise.data);
    //     });
    //   },
    // },
    submitLogin() {
      let user = {
        id: 100,
        name: "张三",
        age: 18,
        sex: "女",
      };
      let url1 = "http://localhost:8080/axios/updateUser";
      this.$axios.put(url1, { params: user }).then(function (promise) {
        console.log(promise.data);
      });
    },
  },
};
</script>

<style>
.loginContainer {
  border-radius: 15px;
  background-clip: padding-box;
  margin: 180px auto;
  width: 350px;
  padding: 15px 35px 15px 35px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}
.loginTitle {
  margin: 0px auto 40px auto;
  text-align: center;
}
.loginRemember {
  text-align: left;
  margin: 0px 8px 15px 8px;
}
</style>
