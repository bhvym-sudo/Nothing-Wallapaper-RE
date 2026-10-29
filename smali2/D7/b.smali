.class public final synthetic LD7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LD7/c;


# direct methods
.method public synthetic constructor <init>(LD7/c;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD7/b;->q:LD7/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, LD7/b;->q:LD7/c;

    invoke-virtual {p0}, Lcom/android/launcher3/dragndrop/a;->j()V

    return-void
.end method
