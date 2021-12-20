import Vue from "vue";
import VueRouter from "vue-router";
import Login from "../components/Login.vue";
import ElementUI from "../components/ElementUI.vue";
import Home from "../components/Home.vue";
import Register from "../components/Register.vue";
import User from "../components/user/user.vue";
import Item from "../components/items/Item.vue";
import ItemCat from "../components/items/ItemCat.vue";
import addItem from "../components/items/addItem.vue";
//使用路由机制
Vue.use(VueRouter);
const routes = [
  { path: "/", redirect: "/login" },
  {
    path: "/login",
    component: Login
  },
  { path: "/register", component: Register },
  { path: "/elementUI", component: ElementUI },
  {
    path: "/home",
    component: Home,
    children: [
      { path: "/user", component: User },
      {
        path: "/item",
        component: Item,
        children: []
      },
      { path: "/itemCat", component: ItemCat },
      { path: "/item/addItem", component: addItem }
    ]
  }
];

//路由导航守卫!!!!!!!

const router = new VueRouter({
  routes
});

export default router;
