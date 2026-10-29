.class public final synthetic LU7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU7/a;->q:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, LU7/a;->q:Landroid/content/Context;

    invoke-static {p0}, LU7/b;->a(Landroid/content/Context;)V

    return-void
.end method
