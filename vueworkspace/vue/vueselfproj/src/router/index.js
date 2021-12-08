import Vue from "vue";
import VueRouter from "vue-router";
import Index from "../components/Index";
import List from "../components/user/List";
Vue.use(VueRouter);

const routes = [
  { path: "/", redirect: "/index" },
  { path: "/index", component: Index },
  { path: "/users", component: List },
];

const router = new VueRouter({
  routes,
});

export default router;
