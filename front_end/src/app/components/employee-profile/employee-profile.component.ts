import { Component } from '@angular/core';
import { EmployeeService } from '../../service/employee.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../../common/employee';

@Component({
  selector: 'app-employee-profile',
  templateUrl: './employee-profile.component.html',
  styleUrl: './employee-profile.component.css'
})
export class EmployeeProfileComponent {
employee :Employee=new Employee
  currentEmployeeId:number=1
  constructor(private service:EmployeeService,private router:ActivatedRoute){ }
  ngOnInit(){
   this.displayEmployeeProfile();
  }
displayEmployeeProfile(){
  this.service.getEmployee(this.currentEmployeeId).subscribe((data)=>{
    this.employee=data
    
  })
}
  

  }


