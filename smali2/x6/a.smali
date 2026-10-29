.class public final synthetic Lx6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lx6/c;

.field public final synthetic r:I

.field public final synthetic s:I

.field public final synthetic t:Lcom/android/wallpaper/asset/a$d;


# direct methods
.method public synthetic constructor <init>(Lx6/c;IILcom/android/wallpaper/asset/a$d;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/a;->q:Lx6/c;

    iput p2, p0, Lx6/a;->r:I

    iput p3, p0, Lx6/a;->s:I

    iput-object p4, p0, Lx6/a;->t:Lcom/android/wallpaper/asset/a$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lx6/a;->q:Lx6/c;

    iget v1, p0, Lx6/a;->r:I

    iget v2, p0, Lx6/a;->s:I

    iget-object p0, p0, Lx6/a;->t:Lcom/android/wallpaper/asset/a$d;

    invoke-static {v0, v1, v2, p0}, Lx6/c;->u(Lx6/c;IILcom/android/wallpaper/asset/a$d;)V

    return-void
.end method
