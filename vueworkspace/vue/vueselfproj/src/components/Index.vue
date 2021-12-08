<template>
  <div>
    <el-carousel indicator-position="outside">
      <el-carousel-item v-for="item in imgs" :key="item">
        <el-image :src="item" fit="contain" style="width: 100%"></el-image>
      </el-carousel-item>
    </el-carousel>
  </div>
</template>

<script>
import homeImg1 from "../assets/indexImgs/1.png";
import homeImg2 from "../assets/indexImgs/2.png";
import homeImg3 from "../assets/indexImgs/3.jpg";
import homeImg4 from "../assets/indexImgs/4.jpg";
import homeImg5 from "../assets/indexImgs/5.jpg";
import homeImg6 from "../assets/indexImgs/6.jpg";
export default {
  name: "Index",
  data() {
    return {
      imgs: [homeImg1, homeImg2, homeImg3, homeImg4, homeImg5, homeImg6],
    };
  },
};
</script>
<style></style>
