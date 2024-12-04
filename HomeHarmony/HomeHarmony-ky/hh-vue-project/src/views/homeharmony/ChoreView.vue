el<template>
    <div>
        <el-container style="height: 700px; border: 1px solid #eee">
            <el-header style="font-size:40px; background-color: rgb(238, 241, 246)">HomeHarmony</el-header>
            <el-container>
                <el-aside width="220px" style="border: 1px solid #eee">
                     <el-menu :default-openeds="['1', '3']">
                        <el-submenu index="1">
                            <template slot="title"><i class="el-icon-message"></i>System Management</template>
                            
                            <el-menu-item index="1-1">
                                <router-link to="/chores">Chores</router-link>
                            </el-menu-item>
                            <el-menu-item index="1-2">Users</el-menu-item>
                            
                        </el-submenu>
                        <el-submenu index="2">
                            <template slot="title"><i class="el-icon-menu"></i>Navigator Two</template>
                            <el-menu-item-group>
                            <template slot="title">Group 1</template>
                            <el-menu-item index="2-1">Option 1</el-menu-item>
                            <el-menu-item index="2-2">Option 2</el-menu-item>
                            </el-menu-item-group>
                            <el-menu-item-group title="Group 2">
                            <el-menu-item index="2-3">Option 3</el-menu-item>
                            </el-menu-item-group>
                            <el-submenu index="2-4">
                            <template slot="title">Option 4</template>
                            <el-menu-item index="2-4-1">Option 4-1</el-menu-item>
                            </el-submenu>
                        </el-submenu>
                     
                    </el-menu>

                </el-aside>
                <el-main>
                     <el-table :data="tableData" border>
                        <el-table-column prop="choreName" label="Chore Name" width="200"></el-table-column>
                        <el-table-column prop="points" label="Points" width="180"></el-table-column>
                        <el-table-column prop="createTime" label="Create Time" width="180"></el-table-column>
                        <el-table-column prop="updateTime" label="Update Time" width="180"></el-table-column>
                        <el-table-column label="Options">
                            <template #default="scope">
                                <el-button type="primary" size="mini" @click="editChore(scope.row)">Edit</el-button>
                                <el-button type="danger" size="mini" @click="deleteChore(scope.row.id)">Delete</el-button>
                            </template>
                        </el-table-column>
                    </el-table>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    data() {
        return {
            tableData: []
        }
    },
    methods: {
       // 编辑任务的方法，跳转到编辑页面或处理编辑逻辑
        editChore(chore) {
            // 可以将用户引导至编辑页面或者展示编辑弹窗
            console.log('Edit chore:', chore);
            // 如果需要跳转到编辑页面，可以使用 this.$router.push
            this.$router.push({ name: 'EditChore', params: { id: chore.id } });
        },
        // 删除任务的方法，发起 DELETE 请求
        deleteChore(choreId) {
            this.$confirm('Are you sure you want to delete this chore?', 'Warning', {
                confirmButtonText: 'Yes',
                cancelButtonText: 'No',
                type: 'warning'
            }).then(() => {
                axios.delete(`http://localhost:8080/chores/${choreId}`)
                    .then(() => {
                        this.$message({
                            type: 'success',
                            message: 'Chore deleted successfully!'
                        });
                        // 更新数据，重新获取 chore 列表
                        this.fetchChores();
                    })
                    .catch(error => {
                        this.$message({
                            type: 'error',
                            message: 'Failed to delete the chore.'
                        });
                        console.error('Error deleting chore:', error);
                    });
            }).catch(() => {
                this.$message({
                    type: 'info',
                    message: 'Deletion canceled'
                });
            });
        },
        // 获取 chore 列表的方法
        fetchChores() {
            axios.get("http://localhost:8080/chores")
                .then((result) => {
                    console.log(result.data.data);
                    this.tableData = result.data.data;
                })
                .catch((error) => {
                    console.error('Error fetching chores:', error);
                });
        }
            

    },
    mounted() {
        // axios.get("http://localhost:8080/chores").then((result) => {
        //     console.log(result.data.data);
        //     this.tableData = result.data.data;
        // });
        this.fetchChores();
    }
    
}
</script>

<style>

</style>