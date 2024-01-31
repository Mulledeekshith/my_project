import { Component } from '@angular/core';
import { JobService } from '../../service/job.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Job } from '../../common/job';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { JobCategoryService } from '../../service/job-category.service';
import { JobCategory } from '../../common/job-category';

@Component({
  selector: 'app-post-job',
  templateUrl: './post-job.component.html',
  styleUrl: './post-job.component.css'
})
export class PostJobComponent {
  job: Job = new Job();
  jobFormGroup: FormGroup;
  categories: JobCategory[]

  constructor(
    private formBuilder: FormBuilder,
    private service: JobService,
    private router: Router,
    private jobCategoryService: JobCategoryService
  ) { }
  ngOnInit() {
    this.jobFormGroup = this.formBuilder.group({
      title: ['', [Validators.required, Validators.pattern('^[a-zA-z]+$')]],
      companyName: ['', [Validators.required, Validators.pattern('^[a-zA-z]+$')]],
      jobDescription: ['', [Validators.required]],
      skillsRequired: ['', [Validators.required]],
      street: ['', [Validators.required]],
      city: [''],
      pincode: ['', [Validators.required, Validators.pattern('[0-9]{6}$')]],
      state: [''],
      country: [''],
      jobType: [''],
      salaryRange: [''],
      experience: [''],
      categoryId: ['']
    })
    this.jobCategoryService.getCategories().subscribe((data) => {
      this.categories = data;
    });


  }
  addJob() {
    if (this.jobFormGroup.valid) {
      this.service.createJob(this.jobFormGroup.value)
      //this.job.categoryId =this.jobFormGroup.get('categoryId')?.value;
     
      this.service.createJob(this.job)
        .subscribe((data) => {
          alert("Job added successfully");
          console.log(data)
          
          // this.router.navigateByUrl('/job-list')
          
        })
       
        
    } else {
      alert("Please fill all the fields correctly")
    }
  }
  // onCategoryChange(categoryId: string) {
  //   this.jobFormGroup.get('categoryId').setValue(categoryId);


}
