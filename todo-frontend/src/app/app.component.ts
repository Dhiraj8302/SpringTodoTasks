import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { error } from 'console';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet,FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  constructor(private http:HttpClient){

  }

  addtask ={
    taskName:'',
    status:0
  }

  Tasks:any = []

  ngOnInit(){
      this.fetchTasks();
    
  }

  fetchTasks() {
    this.http.get("http://localhost:8083/getAll").subscribe(
      (data) => {
        this.Tasks = data;
        console.log(data);
      },
      (error) => {
        console.log(error);
      }
    );
  }

  insert(){
    this.http.post("http://localhost:8083/insert",this.addtask).subscribe(
      (data)=>{
        console.log("Inserted");
        this.fetchTasks();
        location.reload();
      },
      (error)=>{
        console.log(error)
      }
    )
  }

  delete(id:any){
    this.http.delete(`http://localhost:8083/delete/${id}`).subscribe(
      (data)=>{
        console.log("Deleted");
        this.fetchTasks();
        location.reload();
      },
      (error)=>{
        console.log(error)
      }
    )
  }
  updateStatus(task:any){
    task.status=1;
    this.http.put("http://localhost:8083/update",task).subscribe(
      (data)=>{
        console.log("Updated");
        this.fetchTasks();
        location.reload();
      },
      (error)=>{
        console.log(error)
      }
    )
  }

  updateTitle(task:any){
    var title = prompt("Enter new Title",task.taskName)
    task.taskName=title
    this.http.put("http://localhost:8083/update",task).subscribe(
      (data)=>{
        console.log("Updated");
        this.fetchTasks();
        location.reload();
      },
      (error)=>{
        console.log(error);
      }
    )
  }
}
