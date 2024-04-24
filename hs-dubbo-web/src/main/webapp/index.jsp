<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
<div id="app">
    <form id="form-reg">
        <p>用户名称：<input name="username" v-model="user.username"></p>
        <p>用户密码：<input name="password" v-model="user.password"></p>
        <p>移动电话：<input name="phone" v-model="user.phone"></p>
        <p><input type="button" id="btn-reg" value="register" @click="reg"></p>
    </form>
</div>
<script>
    const app = {
        data() {
            return {
                user: {
                    username: '',
                    password: '',
                    phone: ''
                }
            }
        },
        methods: {
            reg() {
                console.log(this.user);
                axios.post("/hs-dubbo-web/reg", this.user, {
                    headers: {
                        'Content-Type': 'application/json;charset=UTF-8'
                    }
                })
                    .then(res => {
                        console.log(res.data);
                        alert("123123");
                        alert(res.data);
                    })
                    .catch(err => {
                        alert("注册失败");
                        console.log(err.data);
                    });
            }
        }
    };
    Vue.createApp(app).mount('#app');
</script>
</body>
</html>
