import { Component, OnInit } from '@angular/core';

import { AuthServiceService } from '../../service/auth.service';
import { Router } from '@angular/router';
import { EmployeeService } from '../../service/employee.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from '../../common/employee';
import { Employer } from '../../common/employer';
import { EmployerService } from '../../service/employer.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  role: any;


  constructor(private employeeService: EmployeeService, private router: Router, private employerService: EmployerService) { }

  players: any;
  loginForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.maxLength(30)]),
    password: new FormControl('', [Validators.required, Validators.maxLength(30)]),
    role: new FormControl('')
  });
  login(insert: any) {
    console.log(this.loginForm);
  }
  get emailId() {
    return this.loginForm.get('email');

  }
  get password() {
    return this.loginForm.get('password')
  }
  submit() {
    if (this.emailId?.value?.length === 0 || this.password?.value?.length == 0 || this.emailId?.invalid || this.password?.invalid) {
      alert("enter valid details")
    }
    else {
      alert(JSON.stringify(this.loginForm.value))
      let employee: Employee = new Employee()
      let employer: Employer = new Employer()

      employee.emailId = this.loginForm.value.email
      employee.password = this.loginForm.value.password
      employer.emailId = this.loginForm.value.email
      employer.password = this.loginForm.value.password


      this.employeeService.getEmployeeUser(employee).subscribe
        (
          data => {
            console.log(data)
            this.employeeService.getEmployeeUser(employee).subscribe()
            localStorage.setItem('currentEmployee', JSON.stringify({ email: this.emailId?.value }));
            alert("loged in")
            this.router.navigate(['/employee-page'])
          },
          error => {
            alert("invalid credentials")
          }

        )
      // } else if (this.role?.value === 'employer') {
      //   this.employerService.getEmployerUser(employer).subscribe(
      //     data => {
      //       console.log(data)
      //       this.employerService.getEmployerUser(employer).subscribe()
      //       localStorage.setItem('currentEmployer', JSON.stringify({ email: this.emailId?.value }));
      //       alert("loged in")
      //       this.router.navigate(['/employer-page'])
      //     },
      //     error => {
      //       alert("invalid credentials")
      //     }

      //   )
      // }

    }
  }








}
