new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            age:"",
            email:"",
            sex:""
        },
        userList:[]
    },
    methods:{
        findAll:function(){
            var _this=this;
            axios.get('/vue02_0702/user/findAll.do')
                .then(function(response){
                    _this.userList=response.data;
                    console.log(response);
                })
                .cache(function(error){
                    console.log(error);
                })
        },
        findById:function(userid){
            var _this=this;
            axios.get('/vue02_0702/user/findById.do',{params:{id:userid}})
                .then(function(response){
                    _this.user=response.data;
            // console.log(response);
            $("#myModal").modal("show");
        })
    .catch(function(error){
        console.log(error);
    })
        },
        update:function(user){
            var _this=this;
            axios.post('/vue02_0702/user/updateUser.do',_this.user)
                .then(function(response){
                    console.log(response);
                    _this.findAll();
                })
                .catch(function(error){
                    console.log(error);
                });
        },
        insert:function (user) {
            var _this=this;
            axios.post('/vue02_0702/user/insertUser.do',_this.user)
                .then(function (response) {
                    console.log(response);
                    _this.findAll();
            })
                .catch(function (error) {
                    console.log(error);
                })
        },
        delete:function (userId) {
            var _this=this;
            axios.post('/vue02_0702/user/deleteUser.do',_this.user)
                .then(function (response) {
                    console.log(response);
                    _this.findAll();
                })
                .catch(function (error) {
                    console.log(error);
                })
        }
        },
    created:function(){
        this.findAll();
    }
});