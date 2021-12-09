import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import "./plugins/element.js";
import "./assets/css/global.css";
import "./assets/ali-icon/iconfont.css";
/* 导入富文本编辑器 */
import VueQuillEditor from "vue-quill-editor";

/* 导入富文本编辑器对应的样式 */
import "quill/dist/quill.core.css"; // import styles
import "quill/dist/quill.snow.css"; // for snow theme
import "quill/dist/quill.bubble.css"; // for bubble theme
/* 导入axios包 */
import axios from "axios";

import vueg from "vueg";

/* 设定axios的请求根目录 */
axios.defaults.baseURL = "http://localhost:8091/";
/* 向vue对象中添加全局对象 以后发送ajax请求使用$http对象 */
/* 父组件将参数传递给子组件 需要声明 prototype.key= xxx */
Vue.prototype.$http = axios;

Vue.config.productionTip = false;

/* 定义过滤器 */
Vue.filter("priceFormat", function(price) {
  return (price / 100).toFixed(2);
});

/* 将富文本编辑器注册为全局可用的组件 */
Vue.use(VueQuillEditor);

new Vue({
  router,
  render: h => h(App)
}).$mount("#app");
// const options = {
//   duration: "0.3", //转场动画时长，默认为0.3，单位秒
//   firstEntryDisable: false, //值为true时禁用首次进入应用时的渐现动画，默认为false
//   firstEntryDuration: ".6", //首次进入应用时的渐现动画时长，默认为.6
//   forwardAnim: "fadeInRight", //前进动画，默认为fadeInRight
//   backAnim: "fadeInLeft", //后退动画，默认为fedeInLeft
//   sameDepthDisable: false, //url深度相同时禁用动画，默认为false
//   tabs: [
//     {
//       name: "home"
//     },
//     {
//       name: "my"
//     }
//   ], //默认为[]，name对应路由的name,以实现类似app中点击tab页面水平转场效果，如tab[1]到tab[0]，会使用backAnim动画，tab[1]到tab[2]，会使用forwardAnim动画
//   tabsDisable: false, //值为true时，tabs间的转场没有动画，默认为false
//   disable: false //禁用转场动画，默认为false，嵌套路由默认为true
// };
Vue.use(vueg, router);
