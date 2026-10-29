.class public final synthetic Lj7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LA6/c;


# direct methods
.method public synthetic constructor <init>(LA6/c;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/a;->q:LA6/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lj7/a;->q:LA6/c;

    invoke-static {p0}, Lj7/j;->e(LA6/c;)V

    return-void
.end method
