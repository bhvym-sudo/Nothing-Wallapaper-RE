.class public final synthetic Ly7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Ly7/g;


# direct methods
.method public synthetic constructor <init>(Ly7/g;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/f;->q:Ly7/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Ly7/f;->q:Ly7/g;

    invoke-static {p0}, Ly7/g;->a(Ly7/g;)Landroid/app/AlarmManager;

    move-result-object p0

    return-object p0
.end method
