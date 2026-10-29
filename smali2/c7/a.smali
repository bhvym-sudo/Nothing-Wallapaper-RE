.class public final Lc7/a;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc7/a$a;
    }
.end annotation


# static fields
.field public static final q:Lc7/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lc7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc7/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lc7/a;->q:Lc7/a$a;

    return-void
.end method

.method public constructor <init>(Lg7/k;)V
    .registers 3

    const-string v0, "parentFragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/q;)V

    return-void
.end method


# virtual methods
.method public createFragment(I)Landroidx/fragment/app/q;
    .registers 3

    sget-object p0, Lg7/m;->s:Lg7/m$a;

    sget-object v0, Lc7/a;->q:Lc7/a$a;

    invoke-virtual {v0, p1}, Lc7/a$a;->c(I)Z

    move-result p1

    invoke-virtual {p0, p1}, Lg7/m$a;->a(Z)Lg7/m;

    move-result-object p0

    return-object p0
.end method

.method public getItemCount()I
    .registers 1

    const/4 p0, 0x2

    return p0
.end method
