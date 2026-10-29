.class public final synthetic Ld7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic q:Li7/d;


# direct methods
.method public synthetic constructor <init>(Li7/d;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/j;->q:Li7/d;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .registers 2

    iget-object p0, p0, Ld7/j;->q:Li7/d;

    invoke-static {p0, p1}, Ld7/l;->b(Li7/d;Landroid/content/DialogInterface;)V

    return-void
.end method
