.class public final synthetic Ld7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Le3/Z;


# direct methods
.method public synthetic constructor <init>(Le3/Z;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/h;->q:Le3/Z;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Ld7/h;->q:Le3/Z;

    invoke-static {p0, p1}, Ld7/l;->f(Le3/Z;Landroid/view/View;)V

    return-void
.end method
