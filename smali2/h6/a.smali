.class public final synthetic Lh6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Lh6/c;

.field public final synthetic t:Lcom/android/wallpaper/asset/a$d;


# direct methods
.method public synthetic constructor <init>(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh6/a;->q:I

    iput p2, p0, Lh6/a;->r:I

    iput-object p3, p0, Lh6/a;->s:Lh6/c;

    iput-object p4, p0, Lh6/a;->t:Lcom/android/wallpaper/asset/a$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget v0, p0, Lh6/a;->q:I

    iget v1, p0, Lh6/a;->r:I

    iget-object v2, p0, Lh6/a;->s:Lh6/c;

    iget-object p0, p0, Lh6/a;->t:Lcom/android/wallpaper/asset/a$d;

    invoke-static {v0, v1, v2, p0}, Lh6/c;->t(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V

    return-void
.end method
