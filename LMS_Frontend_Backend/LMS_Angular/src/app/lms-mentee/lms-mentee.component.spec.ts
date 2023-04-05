import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LMSMenteeComponent } from './lms-mentee.component';

describe('LMSMenteeComponent', () => {
  let component: LMSMenteeComponent;
  let fixture: ComponentFixture<LMSMenteeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LMSMenteeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LMSMenteeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
