import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LMSAdminComponent } from './lms-admin.component';

describe('LMSAdminComponent', () => {
  let component: LMSAdminComponent;
  let fixture: ComponentFixture<LMSAdminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LMSAdminComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LMSAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
