import { Component } from '@angular/core';
import { Job } from '../../common/job';
import { JobService } from '../../service/job.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrl: './jobs.component.css'
})
export class JobsComponent {
  jobs: Job[]=[];
 

  constructor(
    private service :JobService,
    private route:ActivatedRoute

  ){}
  ngOnInit() {
    this.displayJobs();

  }

  displayJobs() {
    this.service.getJobs().subscribe((data) => {
      console.log(data);
      this.jobs = data;
    })
  }

}
